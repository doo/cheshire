(defproject cheshire "2.2.3-SNAPSHOT"
  :description "JSON and JSON SMILE encoding, fast."
  :url "https://github.com/dakrone/cheshire"
  :warn-on-reflection false
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [org.codehaus.jackson/jackson-core-asl "1.9.5"]
                 [org.codehaus.jackson/jackson-smile "1.9.5"]]
  :profiles {:dev {:dependencies [[lein-marginalia "0.6.0"]]}
             :1.2.1 {:dependencies [[org.clojure/clojure "1.2.1"]]}
             :1.4 {:dependencies [[org.clojure/clojure "1.4.0-beta3"]]}}
  :aliases {"all" ["with-profile" "1.2.1,dev:dev:dev,1.4"]})
