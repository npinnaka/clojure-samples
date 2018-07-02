;; name space decleration
(ns clojure-samples.core
  ;(:require)
  ;(:import)
  (:gen-class)) ;;gen class is optional used for inheritence and composition

(defn -main ;; function name
  "I don't do a whole lot ... yet." ;; doc strings
  [& args] ;; parameters
  (println "Hello, World!")) ;; print line function.

;;; everything is a function in clojure