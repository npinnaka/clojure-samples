(ns clojure-samples.t99-map-where
  (:require [clojure.string :as str])
  (:gen-class))

(defn parameterize [param]

  (cond
    (= (type param) java.lang.String)                   (str " = " "\"" param "\"")
    (= (type param) java.lang.Long)                     (str " = " (identity param))

    (= (type param) java.math.BigDecimal)               (str " = " (identity param))
    (= (type param) java.lang.Double)                   (str " = " (identity param))
    (= (type param) nil)                                (str " IS NULL ")))

(defn map->where [in-map]
  (map
   (fn [[k v]]
     (str (name k) (parameterize v)))
   in-map))

(str/join " and " (map->where {:a 1 :b "b" :c 1.23M :d 1.45 :e nil}))