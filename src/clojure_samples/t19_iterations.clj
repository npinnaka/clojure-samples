(ns clojure-samples.t19-iterations)

(defn recur-sum [num]
  (if (= num 0)
    (identity 0)
    (+ num (recur-sum (dec num)))))

(defn tail-recur-sum [num]
  (loop [sum          0
         loop-counter num]
    (if (= loop-counter 0)
      (identity sum)
      (recur (+ sum loop-counter) (dec loop-counter)))))

;(+ sum loop-counter) will be set to sum
; (dec loop-counter) to sum

(defn simple-dotimes [n]
  (dotimes [i n] ;;(for i =0 ; i<= 5 ; i ++)
    (println "call " i)))

(defn simple-repeat[n]
  (take n (repeat (rand 10)))) ;; take function pulls n elements from lazy sequence


(defn simple-repeatedly[n]
  (take n (repeatedly #(rand-int 10)))) ;; take function pulls n elements from lazy sequence

;; slight change in syntax

(defn simple-doseq [sequence]
  (println "sequence type " (type sequence))
  (doseq [itm sequence]
    (println itm)))

;(tail-recur-sum 100000) ;; throws StackOverflowError
(recur-sum 100000)

(simple-dotimes 6)
(simple-repeat 5)
(simple-repeatedly 5)

(simple-doseq '(1 2 3 4 5 6))
(simple-doseq '[1 2 3 4 5 6])
(simple-doseq '{:z 26 :a 1 :b 2})

