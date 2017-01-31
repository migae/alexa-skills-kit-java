(def +project+ 'migae/alexa-skills-kit)
(def +version+ "1.2")

(def aws-version "1.11.78")

(set-env!
 :source-paths #{"src/main/java"}
 ;; :resource-paths #{"src/clj"}
 ;; :asset-paths #{"src"}

 :repositories #(conj % ["maven-central" {:url "http://mvnrepository.com"}]
                      ["central" "http://repo1.maven.org/maven2/"])

 :dependencies `[[javax.servlet/javax.servlet-api "3.0.1"]
                 [com.fasterxml.jackson.core/jackson-annotations "2.3.2"]
                 [com.fasterxml.jackson.core/jackson-core "2.3.2"]
                 [com.fasterxml.jackson.core/jackson-databind "2.3.2"]
                 [commons-codec/commons-codec "1.6"]
                 [commons-io/commons-io "2.4"]
                 [joda-time/joda-time "2.0"]
                 [com.amazonaws/aws-lambda-java-core "1.0.0"]
                 [log4j/log4j "1.2.17"]
                 [org.slf4j/slf4j-api "1.7.0"]
                 [org.slf4j/slf4j-log4j12 "1.7.0"]
                 ])

(task-options!
 ;; target {:dir "build"}
 pom  {:project     +project+
       :version     +version+
       :description "Alexa Skills Kit, modified to run on GAE"
       :url         "https://github.com/migae/alexa-skills-kit"
       :scm         {:url "https://github.com/migae/alexa-skills-kit"}
       :license     {"Apache" "http://aws.amazon.com/apache2.0/"}})

(deftask build
  "build and install using boot"
  [v verbose bool "verbose"]
  (comp (javac :options ["-source" "1.7", "-target" "1.7"])
        (pom)
        (uber)
        (jar)
        (target)
        (install :pom "./pom.xml")))
