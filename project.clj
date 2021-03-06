(defproject org.clojure/data.avl "0.0.12-SNAPSHOT"
  :description "Persistent sorted maps and sets with log-time rank queries"
  :url "https://github.com/clojure/data.avl"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :min-lein-version "2.2.0"
  :parent [org.clojure/pom.contrib "0.1.2"]
  :dependencies [[org.clojure/clojure "1.5.1"]]
  :jvm-opts ^:replace []
  :source-paths ["src/main/clojure" "src/main/cljs"]
  :test-paths ["src/test/clojure"]
  :global-vars {*warn-on-reflection* true}
  :profiles {:dev {:dependencies [[org.clojure/clojurescript "0.0-2138"]]
                   :plugins [[lein-cljsbuild "1.0.1"]]
                   :cljsbuild
                   {:builds {:test
                             {:source-paths ["src/main/cljs"
                                             "src/test/clojure"
                                             "src/test/cljs"]
                              :compiler {:output-to "out/test.js"
                                         :optimizations :advanced
                                         :pretty-print false}}}}}
             :1.6 {:dependencies [[org.clojure/clojure "1.6.0-alpha3"]
                                  [collection-check "0.1.1"]]
                   :test-paths ["src/test_local/clojure"]}})
