(ns clojure-samples.t15-if-then-and-everything-else
  ;(:require)
  ;(:import)
  (:gen-class))

(defn simple-if
  "function for if"
  [a b]
  (if (> a b)
    (identity true)))


(defn simple-if-else
  "function for if else"
  [a b]
  (if (> a b)
    (identity true)
    (identity false)))

;;function calls
(simple-if 4 3)
(simple-if-else 3 4)
