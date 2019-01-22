echo "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"
cd ume-quickstart-tool

mvn clean install

mvn archetype:create-from-project

cd target/generated-sources/archetype

mvn clean deploy

cd ../../..

cp -r /E/Y target/umestore/org/umeframework/quickstart/* ../../umestore/org/umeframework/quickstart/

cd ..
