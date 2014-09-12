(defproject clj-orient "0.6.0"
  :description "Wrapper for the OrientDB Native APIs. It supports version 1.1 of the APIs."
  :url "https://github.com/eduardoejp/clj-orient"
  :license {:name "Eclipse Public License - v 1.0"
            :url "http://www.eclipse.org/legal/epl-v10.html"
            :distribution :repo
            :comments "same as Clojure"}
  :plugins [;; [lein-autodoc "0.9.0"]    -- EAD - suggestion to go to codox? http://stackoverflow.com/questions/13978057/lein-autodoc-with-leiningen-2
            ;; [lein-swank "1.4.4"]      -- EAD - only needed for Slime, which should probably not be in a library
            [codox "0.8.10"]]
  :dependencies [[org.clojure/clojure "1.6.0"]
                 ;; -- EAD - upgrade to 1.6.* - [com.orientechnologies/orient-commons "1.1.0"]
                 ;; -- EAD - upgrade to 1.6.* - [com.orientechnologies/orientdb-client "1.1.0"]
                 ;; -- EAD - upgrade to 1.6.* - [com.orientechnologies/orientdb-core "1.1.0"]
                 ;; -- EAD - upgrade to 1.6.* - [com.orientechnologies/orientdb-object "1.1.0"]
                 [com.orientechnologies/orient-commons "1.6.6"]
                 [com.orientechnologies/orientdb-client "1.6.6"]
                 [com.orientechnologies/orientdb-core "1.6.6"]
                 [com.orientechnologies/orientdb-object "1.6.6"] 
                 ]
  ;; :repositories {"sonatype" "https://oss.sonatype.org/content/groups/public/"}    -- EAD - can be removed?
  ;; :autodoc {:name "clj-orient"                                                    -- EAD - can be removed?
  ;;           :description "Wrapper for the OrientDB Native APIs. It supports version 1.1 of the APIs."
  ;;           :copyright "Copyright 2011~2012 Eduardo Julian"
  ;;           :web-src-dir "http://github.com/eduardoejp/clj-orient/blob/"
  ;;           :web-home "http://eduardoejp.github.com/clj-orient/"
  ;;           :output-path "autodoc"}
  :codox {:exclude clj-orient.kv}
  )
