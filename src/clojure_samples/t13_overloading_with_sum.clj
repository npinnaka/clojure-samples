;; name space decleration
(ns clojure-samples.overloading-with-sum
  ;(:require)
  ;(:import)
  (:gen-class))

;;gen class is optional used for inheritence and composition
;;; everything is a function in clojure

(defn calc-sum [a b]
  (println "sum of " a " and " b " = " (+ a b)))

(defn apply-var-args-sum [& args]
    (apply + args)
  )

(defn recude-var-args-sum[& args]
  (reduce + args))


;;function calls
(calc-sum 1 3)
(calc-sum 1.43 3.54)
(calc-sum 1 3.54)

(apply-var-args-sum 1)
(apply-var-args-sum 1 2.43 3 44.34 5)

(apply-var-args-sum)
(recude-var-args-sum)
