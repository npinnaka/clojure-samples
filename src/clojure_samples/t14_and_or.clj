(ns clojure-samples.and-or
  ;(:require)
  ;(:import)
  (:gen-class))

(defn simple-conditions
  [a b]
  (println "(= a b) " (= a b))
  (println "(> a b) " (> a b))
  (println "(< a b) " (< a b))
  (println "(>= a b) " (>= a b))
  (println "(<= a b) " (<= a b))
  (println "(not= a b) " (not= a b)))

(defn and-conditions
  [a b c d]
  (println "(and  (> a b ) (< c d )) " (and (> a b) (< c d)))
  (println "(and  (<= a b ) (<= c d )) " (and (<= a b) (<= c d))))


(defn or-conditions
  [a b c d]
  (println "(or  (> a b ) (< c d )) " (or (> a b) (< c d)))
  (println "(or  (<= a b ) (<= c d )) " (or (<= a b) (<= c d))))

(defn and-or-conditions
  [a b]
  (println "(= a b) " (= a b))
  (println "(> a b) " (> a b))
  (println "(< a b) " (< a b))
  (println "(>= a b) " (>= a b))
  (println "(<= a b) " (<= a b))
  (println "(not= a b) " (not= a b)))

(simple-conditions 3 4)
(and-conditions 1 2 3 4)
(or-conditions 1 2 3 4)