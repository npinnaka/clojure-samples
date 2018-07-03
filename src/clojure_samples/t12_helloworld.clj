;; name space decleration
(ns clojure-samples.helloworld
  ;(:require)
  ;(:import)
  (:gen-class))

;;gen class is optional used for inheritence and composition

(defn print-hello-world ;; function name
  "I don't do a whole lot ... yet." ;; doc strings
  []
  ;; parameters
  (println "Hello, World!"))

;; print line function.


(defn greeting ;; function name
  "I don't do a whole lot ... yet." ;; doc strings
  [name]
  ;; parameters
  (println "Hello, " name))

;; print line function.

;;; everything is a function in clojure
;;function calls
(print-hello-world)

(greeting "Clojure")