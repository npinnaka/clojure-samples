(ns t20-collections-sets
  (:require [clojure.set :as cset] ))

(def my-set #{1 2 3 4 5 6})

(type my-set)

; returns set;
;; common set functions
;check for empty? and nil?
(nil? my-set)
(nil? '())

(empty? my-set)
(empty? '())

(seq my-set)
(seq '())

;iterate
(doseq [x my-set]
  (println "iterate with doseq" x))

;map
(map println my-set)
(map #(println "iterate with map " %) my-set)

(loop [x my-set]
  (when (seq x)
    (println "iterate with loop recur " (first x))
    (recur (rest x))))

;;size of set
(count my-set)

;first element
(first my-set)

(nth my-set 0)

;second element;
(second my-set)

(nth my-set 1)

;nth element;
(nth my-set 4)


;subset
(pop my-set)
(subvec my-set 2)
(next my-set);; looks for next elements and if not found returns nil
(rest my-set);; apply seq on rest of the elements; never returns nil and if no elements found returns seq also lazy

;; append a to set
(conj my-set 7) ;; conj on list always appends last

;;join list
(conj [1 2 3] [4 5 6]) ;; returns [1 2 3 [4 5 6]]
(concat [1 2 3] [4 5 6]) ;; returns sequence (1 2 3 4 5 6)
(cset/union [1 2 3] [4 5 6]) ;; return [1 2 3 4 5 6]

;sorting
(into (sorted-set-by > ) my-set)
(sorted-set-by <  5 6 3 6 8 4 2 )

;;searching
(contains? my-set 4) ;; return true or false
(get my-set 4) ;; not 4th element we are looking for 4; returns value or nul
(get my-set 9)
(filter #(= % 4) my-set)


;; removing eleements
(disj my-set 1)