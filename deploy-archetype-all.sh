echo "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"
echo "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"
echo "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"
echo "@@@ Starting ..."

echo "@@@ Enter ume-quickstart-boot fold..."
cd ume-quickstart-boot

mvn clean install
echo "@@@ Start create archetype project..."
mvn archetype:create-from-project
cd target/generated-sources/archetype/
echo "@@@ Switch to generated archetype-project's fold"
mvn clean deploy
echo "@@@ deploy finished, Prepare copy generated archetype-project to repository"
cd ../../..
cp -r target/generated-sources/umestore/org/umeframework/quickstart ../../umestore/org/umeframework/
echo "@@@ Copied generated archetype-project to repository"

echo "@@@ Return to workspace..."
cd ..
ls

echo "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"
echo "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"
echo "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"
echo "@@@ Starting ..."

echo "@@@ Enter ume-quickstart-boot-uac fold..."
cd ume-quickstart-boot-uac

mvn clean install
echo "@@@ Start create archetype project..."
mvn archetype:create-from-project
cd target/generated-sources/archetype/
echo "@@@ Switch to generated archetype-project's fold"
mvn clean deploy
echo "@@@ deploy finished, Prepare copy generated archetype-project to repository"
cd ../../..
cp -r target/generated-sources/umestore/org/umeframework/quickstart ../../umestore/org/umeframework/
echo "@@@ Copied generated archetype-project to repository"

echo "@@@ Return to workspace..."
cd ..
ls


echo "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"
echo "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"
echo "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"
echo "@@@ Enter ume-quickstart-tool fold..."
cd ume-quickstart-tool

mvn clean install
echo "@@@ Start create archetype project..."
mvn archetype:create-from-project
cd target/generated-sources/archetype/
echo "@@@ Switch to generated archetype-project's fold"
mvn clean deploy
echo "@@@ deploy finished, Prepare copy generated archetype-project to repository"
cd ../../..
cp -r target/generated-sources/umestore/org/umeframework/quickstart ../../umestore/org/umeframework/
echo "@@@ Copied generated archetype-project to repository"

echo "@@@ Return to workspace..."
cd ..
ls

echo "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"
echo "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"
echo "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"
echo "@@@ Enter ume-quickstart-webapp fold..."
cd ume-quickstart-webapp

mvn clean install
echo "@@@ Start create archetype project..."
mvn archetype:create-from-project
cd target/generated-sources/archetype/
echo "@@@ Switch to generated archetype-project's fold"
mvn clean deploy
echo "@@@ deploy finished, Prepare copy generated archetype-project to repository"
cd ../../..
ls
cp -r target/generated-sources/umestore/org/umeframework/quickstart ../../umestore/org/umeframework/
echo "@@@ Copied generated archetype-project to repository"

echo "@@@ Return to workspace..."
cd ..
ls




