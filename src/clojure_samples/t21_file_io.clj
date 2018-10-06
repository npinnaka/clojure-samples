(ns t21-file-io
  (:require [clojure.java.io :as io]))

(spit "resources/sample.txt" "\nwelcome" :append true)
(slurp "resources/sample.txt")
