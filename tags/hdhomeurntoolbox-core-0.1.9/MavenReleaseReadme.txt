To create a new release run the seetings file contains the auth to:

mvn -DmavenExecutorId=forked-path -Dusername=GGCODE_USERID -Dpassword=GGCODE_PWD release:prepare

The settings file contains the auth token to the deploy maven repo:
mvn -s ../../tools/settings.xml -DmavenExecutorId=forked-path -Dusername=GGCODE_USERID -Dpassword=GGCODE_PWD release:perform

mvn -DmavenExecutorId=forked-path -Dusername=GGCODE_USERID -Dpassword=GGCODE_PWD release:rollback

