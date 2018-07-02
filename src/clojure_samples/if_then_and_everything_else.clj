(ns clojure-samples.if-then-and-everything-else
  ;(:require)
  ;(:import)
  (:gen-class))

(defn simple-if[a b]
  (if (> a b)
    (identity true)))


(defn simple-if-else[a b]
  (if (> a b)
    (identity true)
    (identity false)))

(simple-if 4 3)
(simple-if-else 3 4)