(defproject org.pinkgorilla/lein-pinkgorilla "0.0.1-SNAPSHOT"
  :description "A Leiningen plugin for the PinkGorilla Notebook."
  :url "https://github.com/pink-gorilla/lein-pinkgorilla"
  :license {:name "MIT"}
  :dependencies [[org.pinkgorilla/gorilla-notebook "0.4.17"]]
  :eval-in-leiningen true

  :min-lein-version "2.9.1"
  :min-java-version "1.11"

  :release-tasks [["vcs" "assert-committed"]
                  ["bump-version" "release"]
                  ["vcs" "commit" "Release %s"]
                  ["vcs" "tag" "v" "--no-sign"]
                  ["deploy"]
                  ["bump-version"]
                  ["vcs" "commit" "Begin %s"]
                  ["vcs" "push"]]
  :aliases {"bump-version"
            ["change" "version" "leiningen.release/bump-version"]}
  )
