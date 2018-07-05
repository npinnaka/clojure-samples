(ns clojure-samples.t17-multi-arity-vararg-functions)

(defn greeting
  ([] (greeting "who ever you are"))
  ([name] (println "Hello " name)))

(defn calc-net-slaary [base-salary & {:keys [bonus] :or {bonus 0}}]
  (println "total salary " (+ base-salary bonus)))

(greeting)
(greeting "clojure")

(calc-net-slaary 2000)
(calc-net-slaary 2000 :bonus 400)