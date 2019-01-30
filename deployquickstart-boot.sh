echo "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"
cd ume-quickstart-boot

mvn clean install

mvn archetype:create-from-project

cd target/generated-sources/archetype

mvn clean deploy

cd ../../..

cp -r target/umestore/org/umeframework/quickstart/* ../../umestore/org/umeframework/quickstart/

cd ..
