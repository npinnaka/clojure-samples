(ns clojure.samples.t18-recursion)

(defn prime?
  ([num] (prime? num 2))
  ([num counter]
   (if (= num counter)
     (identity "prime")
     (if (= 0 (mod num counter))
       (identity "not prime")
       (prime? num (inc counter))))))

(defn fact[num]
  (if (= num 1)
    (identity 1)
    (* num (fact (dec num)))))

;;function calls
(fact 20)
(fact 5)

(prime? 7)
(prime? 31)
(prime? 64)


(prime? 7 2)
(prime? 31 2)
(prime? 999 2)
