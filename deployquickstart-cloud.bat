cd ume-quickstart-cloud
call mvn clean install
call mvn archetype:create-from-project
cd target\generated-sources\archetype\
call mvn clean deploy
cd ..\..\..
xcopy /E/Y target\umestore\org\umeframework\quickstart\* ..\..\umestore\org\umeframework\quickstart\
cd ..
