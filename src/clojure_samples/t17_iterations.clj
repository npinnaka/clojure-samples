(ns clojure-samples.t17-iterations)

(defn recur-sum [num]
  (if (= num 0)
    0
    (+ num (recur-sum (dec num)))))

(defn tail-recur-sum [num]
  (loop [sum          0
         loop-counter num]
    (if (= loop-counter 0)
      sum
      (recur (+ sum loop-counter) (dec loop-counter)))))

(tail-recur-sum 100000)
(recur-sum 100000)
