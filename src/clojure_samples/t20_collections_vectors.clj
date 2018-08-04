(ns t20-collections-vectors
  (:require [clojure.set :as cset] ))

;(vector* args)(vector* a args)(vector* a b args)(vector* a b c args)(vector* a b c d & more)

(vector 1)
(vector 1 2 3 4 5)
(vector 1 [2 3 4 5 6])


(def my-vector (vector 1 2 3 4 5 6))

(type '(1 2 3))

; this is a vector just telling compiler not to evaluate like a function
(type (vector 1 2 3))

; returns vector;
;; common vector functions
;check for empty? and nil?
(nil? my-vector)
(nil? '())

(empty? my-vector)
(empty? '())

(seq my-vector)
(seq '())

;iterate
(doseq [x my-vector]
  (println "iterate with doseq" x))

;map
(map println my-vector)
(map #(println "iterate with map " %) my-vector)

(loop [x my-vector]
  (when (seq x)
    (println "iterate with loop recur " (first x))
    (recur (rest x))))

;;size of vector
(count my-vector)

;first element
(first my-vector)

(nth my-vector 0)

;second element;
(second my-vector)

(nth my-vector 1)

;nth element;
(nth my-vector 4)
(get my-vector 4)


;subvector
(next my-vector);; looks for next elements and if not found returns nil
(rest my-vector);; apply seq on rest of the elements; never returns nil and if no elements found returns seq also lazy

;; apped a to vector
(conj my-vector 7) ;; conj on list always appends last

;;join list
(conj [1 2 3] [4 5 6]) ;; returns [1 2 3 [4 5 6]]
(concat [1 2 3] [4 5 6]) ;; returns sequence (1 2 3 4 5 6)
(cset/union [1 2 3] [4 5 6]) ;; return [1 2 3 4 5 6]