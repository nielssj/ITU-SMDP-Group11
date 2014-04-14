package dk.itu.smdp.group11.survey.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import group11survey.Survey
import group11survey.Question
import group11survey.Answer

class SurveyGenerator implements IGenerator {

    def static compileToHtml( Survey it ) {
        var int i = 0
        '''<!DOCTYPE html>
<html ng-app="survey">
    <head>
        <title>Sample Survey</title>
        <link rel="stylesheet" href="//cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.1.1/css/bootstrap.min.css">
        <link rel="stylesheet" href="//cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.1.1/css/bootstrap-theme.min.css">
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.1.1/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/angular.js/1.2.15/angular.min.js"></script>
    </head>
    <body>
        <br />
        <div class="container">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h1 class="panel-title">« it.name »</h1>
                </div>
                <div class="panel-body">
                    <p class="lead into">« it.intro »</p>
                    <form class="form-vertical col-md-12" role="form">
                        «FOR question : questions»
                        <div class="form-group" « IF ( isFollowup( it, question) ) »ng-show="« showQuestionTrigger( it, question ) »"« ENDIF »>
                            <p>« question.body »</p>«
                            FOR answer : question.answers
                            »
                            <div class="« IF ( question.isExclusive ) »radio« ELSE »checkbox« ENDIF »">
                                « IF ( ! answer.isFreeText ) »<label>« ENDIF »
                                    « IF ( question.isExclusive ) »
                                    <input type="radio" value="« answer.body »" ng-model="survey.questions.« toId( question.name ) ».regular">
                                    « ELSE »
                                    <input type="checkbox" ng-model="survey.questions.« toId( question.name ) ».« toId( answer.body ) »">
                                    « ENDIF »
                                « IF ( answer.isFreeText ) »
                                    « IF ( question.isExclusive ) »
                                        <input ng-disabled="survey.questions.« toId( question.name ) ».regular !== '« answer.body »'" placeholder="« answer.body »" style="width: auto;" ng-required="true" ng-minlength="1" class="form-control" type="text">
                                    « ELSE »
                                        <input ng-disabled="!survey.questions.« toId( question.name ) ».« toId( answer.body ) »" placeholder="« answer.body »" style="width: auto;" ng-required="true" ng-minlength="1" class="form-control" type="text">
                                    « ENDIF »
                                « ELSE »
                                    « answer.body »
                                    </label>
                                « ENDIF »
                            </div>
                            «ENDFOR»
                        </div>«{  i = 0 null }»
«ENDFOR»<button type="submit" class="btn btn-primary pull-right">Submit</button>
                    </form>
                    <p class="lead outro">« it.outro »</p>
                </div>
            </div>
        </div>
    </body>
    <script>
        var survey = angular.module( 'survey', [] );
        survey.controller( 'Survey', function ( $scope ) {
            $scope.survey = {
                questions: {
                    «FOR question : questions SEPARATOR ', '»
                    « question.name »: { « IF ( !question.isExclusive ) »
                        « FOR answer : question.answers SEPARATOR ', '»
                            « toId( question.name ) »: false
                        «ENDFOR»
                    « ELSE »
                        optional: '', regular: ''
                    « ENDIF » }
                    «ENDFOR»
                }
            };
        } );
    </script
</html>'''
    }

    /*
     * Utility function to have workable files and id's as strings.
     */
    def static toId( String text ) {
        text.replaceAll( "\\W+", "" )
    }

    /*
     * Checks if a question is actually a follow-up for at least one other question
     */
    def static isFollowup( Survey survey, Question comparedQuestion ) {
        for ( Question surveyQuestion : survey.questions ) {
            if ( ! surveyQuestion.name.equalsIgnoreCase( comparedQuestion.name ) ) {
                for ( Answer answer : surveyQuestion.answers ) {
                    for ( Question followupQuestion : answer.followup ) {
                        if ( followupQuestion.name.equalsIgnoreCase( comparedQuestion.name ) ) {
                            return true
                        }
                    }
                }
            }
        }
        return false
    }

    /*
     * Creates the condition used by Angular to show or hide a specific follow-up question
     */
    def static showQuestionTrigger( Survey survey, Question comparedQuestion ) {
        var trigger = ""
        for ( Question surveyQuestion : survey.questions ) {
            if ( ! surveyQuestion.name.equalsIgnoreCase( comparedQuestion.name ) ) {
                for ( Answer answer : surveyQuestion.answers ) {
                    for ( Question followupQuestion : answer.followup ) {
                        if ( followupQuestion.name.equalsIgnoreCase( comparedQuestion.name ) ) {
                            if ( surveyQuestion.isExclusive ) {
                                trigger = trigger + "( survey.questions." + toId( surveyQuestion.name ) + ".regular === '" + answer.body + "' ) || "
                            } else {
                                trigger = trigger + "( survey.questions." + toId( surveyQuestion.name ) + "." + toId( answer.body )/** */ + " ) || "
                            }
                        }
                    }
                }
            }
        }
        trigger = trigger + "false"
    }

    override void doGenerate(Resource resource, IFileSystemAccess fsa) {
        resource.allContents.toIterable.filter( typeof( Survey ) ).forEach[ Survey it |
            fsa.generateFile( "surveys/" + toId( it.name ) + "/html/survey.html", it.compileToHtml )
        ]
    }
}
