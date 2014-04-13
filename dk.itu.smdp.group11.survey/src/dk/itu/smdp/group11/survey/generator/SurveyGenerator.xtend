package dk.itu.smdp.group11.survey.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import group11survey.Survey

class SurveyGenerator implements IGenerator {

    def static compileToHtml( Survey it ) {
        '''<!DOCTYPE html>
<html>
    <head>
        <title>Sample Survey</title>
        <link rel="stylesheet" href="//cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.1.1/css/bootstrap.min.css">
        <link rel="stylesheet" href="//cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.1.1/css/bootstrap-theme.min.css">
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.1.1/js/bootstrap.min.js"></script>
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
                            content
                        </div>«ENDFOR»
                        <button type="submit" class="btn btn-primary pull-right">Submit</button>
                    </form>
                    <p class="lead outro">« it.outro »</p>
                </div>
            </div>
        </div>
    </body>
</html>'''
    }

    override void doGenerate(Resource resource, IFileSystemAccess fsa) {
        resource.allContents.toIterable.filter( typeof( Survey ) ).forEach[ Survey it |
            fsa.generateFile( "surveys/" + it.name.replaceAll( "\\W+", "" ) + "/html/survey.html", it.compileToHtml )
        ]
    }
}
