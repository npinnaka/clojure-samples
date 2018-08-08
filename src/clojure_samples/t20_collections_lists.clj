(ns t20-collections-lists
  (:require [clojure.set :as cset] ))

;(list* args)(list* a args)(list* a b args)(list* a b c args)(list* a b c d & more)

(list 1)
(list 1 2 3 4 5)
(list 1 [2 3 4 5 6])

(list* 1 [2 3 4 5 6])

(def my-list (list 1 2 3 4 5 6))

(type '(1 2 3))

; this is a list just telling compiler not to evaluate like a function
(type (list 1 2 3))

; returns list;
;; common list functions
;check for empty? and nil?
(nil? my-list)
(nil? '())


(empty? my-list)
(empty? '())

(seq my-list)
(seq '())

(list? my-list)
(list? '())

;iterate
(doseq [x my-list]
  (println "iterate with doseq" x))

(map println my-list)
(map #(println "iterate with map " %) my-list)

(loop [x my-list]
  (when (seq x)
    (println "iterate with loop recur " (first x))
    (recur (rest x))))
;;size of list
(count my-list)

;first element
(first my-list)

(nth my-list 0)

;second element;
(second my-list)

(nth my-list 1)

;nth element;
(nth my-list 4) ;;
(get my-list 4) ;;; nil

;sublist
(next my-list) ;; looks for next elements and if not found returns nil
(rest my-list) ;; apply seq on rest of the elements; never returns nil and if no elements found returns seq also lazy

;; append a to list
(conj my-list 0) ;; conj on list always appends first

;;join two list
(list* '(1 2 3) '(4 5 6)) ;; returns ((1 2 3) 4 5 6)
(conj '(1 2 3) '(4 5 6)) ;; returns ((4 5 6) 1 2 3)
(concat '(1 2 3) '(4 5 6)) ;; returns (1 2 3 4 5 6)
(cset/union '(1 2 3) '(4 5 6)) ;; return (6 5 4 1 2 3)


;sorting
(into (sorted-set-by > ) my-list)
(sorted-set-by <  5 6 3 6 8 4 2 )

;; searching
(filter #(= % 4) my-list)
(filter #(= % 9) my-list)

;removing elements
(drop 1 my-list)
