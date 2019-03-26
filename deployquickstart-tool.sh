echo "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"
cd ume-quickstart-tool

mvn clean install

mvn archetype:create-from-project

cd target/generated-sources/archetype

mvn clean deploy -DaltDeploymentRepository=internal.repo::default::file:../../umestore

cd ../../..

cp -r target/umestore/org/umeframework/quickstart/* ../../umestore/org/umeframework/quickstart/

cd ..
