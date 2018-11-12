cd ume-quickstart-boot
call mvn clean install
call mvn archetype:create-from-project
cd target\generated-sources\archetype\
call mvn clean deploy
cd ..\..\..
xcopy /E/Y target\generated-sources\umestore\org\umeframework\quickstart\* ..\..\umestore\org\umeframework\quickstart\
cd ..

cd ume-quickstart-boot-uac
call mvn clean install
call mvn archetype:create-from-project
cd target\generated-sources\archetype\
call mvn clean deploy
cd ..\..\..
xcopy /E/Y target\generated-sources\umestore\org\umeframework\quickstart\* ..\..\umestore\org\umeframework\quickstart\
cd ..

cd ume-quickstart-tool
call mvn clean install
call mvn archetype:create-from-project
cd target\generated-sources\archetype\
call mvn clean deploy
cd ..\..\..
xcopy /E/Y target\generated-sources\umestore\org\umeframework\quickstart\* ..\..\umestore\org\umeframework\quickstart\
cd ..

cd ume-quickstart-webapp
call mvn clean install
call mvn archetype:create-from-project
cd target\generated-sources\archetype\
call mvn clean deploy
cd ..\..\..
xcopy /E/Y target\generated-sources\umestore\org\umeframework\quickstart\* ..\..\umestore\org\umeframework\quickstart\
cd ..




