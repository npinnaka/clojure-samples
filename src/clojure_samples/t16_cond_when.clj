(ns clojure-samples.t16-conf-when
  (:gen-class))

(defn cond-function[a b]
  (cond (> a b)
    (identity true)
    :else (identity false)))


(defn when-function[a b]
  (when (< a b) ;; change to > and see for nil
    (identity true)))

(defn when-not-function[a b]
  (when-not (> a b)
    (identity true)))

(defn simple-case [in-val]
    (case in-val
      "" "empty case"
      "1" "case 1"
      "2" (let [rtn "case 2"]
            rtn)
      "default"))

;; function calls
(println "a " (cond-function 5 4))
(println "b " (when-function 5 6))
(println "c" (when-not-function 5 6))

(simple-case "1")
(simple-case "2")

(simple-case "9")