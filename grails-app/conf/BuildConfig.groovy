grails.project.work.dir = 'target'

grails.project.dependency.resolution = {

	inherits 'global'
	log 'warn'

	repositories {
		grailsCentral()
		mavenLocal()
		mavenCentral()
	}

	dependencies {
		compile 'org.codehaus.jackson:jackson-core-asl:1.9.9'
		compile 'org.codehaus.jackson:jackson-mapper-asl:1.9.9'
		compile 'net.sf.opencsv:opencsv:2.3'
		compile 'commons-httpclient:commons-httpclient:3.1', {
			excludes 'commons-codec', 'commons-logging', 'junit'
		}
	}

	plugins {
		build ':release:2.2.1', ':rest-client-builder:1.0.3', {
			export = false
		}
	}
}
