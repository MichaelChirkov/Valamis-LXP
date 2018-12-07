# Valamis - eLearning for Liferay

Valamis LXP is a social learning environment for sharing and receiving knowledge. We want to enable people to share their knowledge and learn through digital technologies and user interaction. You can use Valamis as your organization's social learning environment.

**http://valamis.com/**

[![build status](https://api.travis-ci.org/arcusys/Valamis.png)](http://travis-ci.org/arcusys/Valamis)

### This is Valamis CE version - No support - No warranty
To get a demo of the latest and fully supported Valamis LXP version, contact us by http://www.valamis.com/sign-up-for-a-demo

#### The following features are not supported in this CE version:
* Competences
* Knowledge Map
* Mobile application
* Assignments
* Training Events
* Lesson Studio Beta

Supported Liferay version is 6.2 and DXP 7.0 SP3.
The targeted version of SCORM is 2004 4th edition with support of SCORM 1.2.
All server-side code is written using the Scala programming language for the JVM.

The current implementation is able to display SCORM and Tin Can content with respect towards the different content organizations and the activity structure in each organization.
Application includes a Lesson Studio editor for creating lessons with different types of questions (single-/multi-choice, matching, short answer, etc.)

Administrative features let you manage Tin Can and SCORM packages, uploading them in the standard zipped format.
The user interface is available as JSR-compliant portlets, which may be deployed into Liferay portal.

The solution uses Liferay database, so no there is need to install an additional database.

If deployed against a portlet container, the end-user features are available via the portlet's standard View mode, while administrative features are available via the Edit mode. 

### NOTE
Since version 3.4.1, Valamis Community Edition is separated into three packages on GitHub: Valamis LRS (Learning Record Store, https://github.com/arcusys/valamis-lrs),
Learning Paths (https://github.com/arcusys/learning-paths), Valamis components (this repository). You need to compile all of these.

### Download 
Download Valamis CE source code from this repository and compile the application yourself.

### Building
This is an sbt project.

#### Liferay 6.2
Go to Settings.scala and change the line #10   
`val liferay = Liferay620`

Run
`sbt -J-Xss8M -mem 4096 clean package`

Deploy to the running Liferay instance
`sbt deploy`

#### Liferay DXP
Go to Settings.scala and change the line #10   

`val liferay = Liferay700`

Run

`sbt -J-Xss8M -mem 4096 clean osgiFullPackage`

Deploy the package and all dependencies to the running Liferay instance

`sbt osgiFullDeploy`

### Known issues
**PermGen issue**: Valamis requires 512Mb of PermGen size. This is default size in Liferay bundled with glassfish, but permgen in Tomcat and jBoss bundles should be increased.

Liferay 6.1 EE bundled with Tomcat 7 can throw errors while accessing uploaded content. To avoid this problem, just turn off the GZip conmpression:
`com.liferay.portal.servlet.filters.gzip.GZipFilter=false`

If you change Settings.scala, you must run **clean** command!

If you have several tomcat instances running, specify liferay home dir in deploy and osgiFullDeploy commands:

`sbt deploy /opt/liferay-portal-6.2-ce-ga6`

`sbt osgiFullDeploy /opt/liferay-dxp-digital-enterprise-7.0-sp4`
