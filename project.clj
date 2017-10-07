(defproject ksseono/duckling "0.0.1"
  :description "The linguist that parses text into structured data, forked from wit-ai/duckling"
  :license {:url "https://github.com/ksseono/duckling"
            :comments "see LICENSE"}
  :url "https://github.com/wit-ai/duckling"
  :plugins [[lein-midje "3.2.1"]]
  :repl-options {:init-ns duckling.core}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/tools.nrepl "0.2.12"]
                 [org.clojure/tools.logging "0.4.0"]
                 [clj-time "0.14.0"]
                 [prismatic/plumbing "0.5.4"]]
  :deploy-repositories [["clojars" {:creds :gpg}]]
  :profiles {:dev {:dependencies [[org.clojure/tools.trace "0.7.6"]
                                  [midje "1.8.3"]
                                  [cheshire "5.3.1"]]}
             :uberjar {:aot [duckling.core]}}
  :test-selectors {:default (complement :benchmark)
                   :benchmark :benchmark}
  :scm {:name "git"
        :url "https://github.com/ksseono/duckling"}
  :pom-addition [:developers [:developer
                             [:name "Wit.ai"]
                             [:url "https://github.com/ksseono/duckling"]
                             [:email "ksseono@gmail.com"]
                             [:timezone "-7"]]])
