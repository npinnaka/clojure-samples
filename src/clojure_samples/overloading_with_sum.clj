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

(defn calc-sum [a b]
  (println "sum of " a " and " b " = " (+ a b)))

(defn var-args-sum[& args]
  (if (> (count args) 2)
    (apply + args)
    (identity args))
  )

;;function calls
(print-hello-world)

(greeting "Clojure")

(calc-sum 1 3)
(calc-sum 1.43 3.54)
(calc-sum 1 3.54)

(var-args-sum 1)
(var-args-sum 1 2.43 3 44.34 5)
