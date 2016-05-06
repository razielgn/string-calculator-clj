(defproject string-calculator "0.0.1-SNAPSHOT"
  :description "Cool new project to do things and stuff"
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :profiles {:dev {:plugins [[lein-midje "3.2"]]
                   :dependencies [[midje "1.8.3"]]}
             :midje {}})
