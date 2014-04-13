package dk.itu.smdp.group11.survey.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import group11survey.Survey

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
                        <div class="form-group">
                            <p>« question.body »</p>«
                            FOR answer : question.answers
                            »
                            <div class="« IF ( question.isExclusive ) »radio« ELSE »checkbox« ENDIF »">
                                « IF ( ! answer.isFreeText ) »<label>« ENDIF »
                                    « IF ( question.isExclusive ) »
                                    <input type="radio" value="« answer.body »" ng-model="survey.questions.« question.name.replaceAll( "\\W+", "" ) ».regular">
                                    « ELSE »
                                    <input type="checkbox" ng-model="survey.questions.« question.name.replaceAll( "\\W+", "" ) ».« answer.body.replaceAll( "\\W+", "" ) »">
                                    « ENDIF »
                                « IF ( answer.isFreeText ) »
                                    « IF ( question.isExclusive ) »
                                        <input ng-disabled="survey.questions.« question.name.replaceAll( "\\W+", "" ) ».regular !== '« answer.body »'" placeholder="« answer.body »" style="width: auto;" ng-required="true" ng-minlength="1" class="form-control" type="text">
                                    « ELSE »
                                        <input ng-disabled="!survey.questions.« question.name.replaceAll( "\\W+", "" ) ».« answer.body.replaceAll( "\\W+", "" ) »" placeholder="« answer.body »" style="width: auto;" ng-required="true" ng-minlength="1" class="form-control" type="text">
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
                            « question.name.replaceAll( "\\W+", "" ) »: false
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

    override void doGenerate(Resource resource, IFileSystemAccess fsa) {
        resource.allContents.toIterable.filter( typeof( Survey ) ).forEach[ Survey it |
            fsa.generateFile( "surveys/" + it.name.replaceAll( "\\W+", "" ) + "/html/survey.html", it.compileToHtml )
        ]
    }
}
