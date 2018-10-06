(ns clojure-samples.time-utils
  (:require [clj-time [core :as t] [format :as f] [local :as l]]))

(def date-format (f/formatter-local "yyyyMMdd"))
(def today (convert-date-to-string (t/today)))

(defn convert-string-to-date[date-string]
  (f/parse-local-date date-format date-string))

(defn convert-date-to-string[input-date]
  (f/unparse-local date-format input-date))

(defn add-days
  [in-date days-to-add]
  (t/plus in-date (t/days days-to-add)))

(defn get-last-day-of-previous-month[date-string]
  (add-days (t/first-day-of-the-month (convert-string-to-date date-string)) -1))

(defn get-days-to-add [days]
  (println days)
  (if (= 7 days)
    (* -1 (+ 1 days))
    (* -1 (+ 8 days))))

(defn get-first-day-of-week [input-date]
  (add-days input-date (get-days-to-add (t/day-of-week input-date))))

(defn get-last-day-of-week [input-date]
  (add-days input-date 6))

(get-first-day-of-week (convert-string-to-date "20180610"))
(get-first-day-of-week (convert-string-to-date "20180810"))
(get-first-day-of-week (convert-string-to-date "20180808"))
(get-first-day-of-week (convert-string-to-date "20180805"))

(get-last-day-of-week (get-first-day-of-week (convert-string-to-date "20180610")))
(get-last-day-of-week (get-first-day-of-week (convert-string-to-date "20180810")))


(t/day-of-week (convert-string-to-date "20180805"))
(t/day-of-week (convert-string-to-date "20180806"))
(t/day-of-week (convert-string-to-date "20180807"))
(t/day-of-week (convert-string-to-date "20180808"))
(t/day-of-week (convert-string-to-date "20180809"))
(t/day-of-week (convert-string-to-date "20180810"))
(t/day-of-week (convert-string-to-date "20180811"))

(defn determine-calculate-dates [calc-type]
  (if (= "monthly" calc-type)
    {:start-date (convert-date-to-string
                  (t/first-day-of-the-month (get-last-day-of-previous-month today)))
     :end-date   (convert-date-to-string
                  (t/last-day-of-the-month (get-last-day-of-previous-month today)))}
    (if (= "weekly" calc-type)
      {:start-date (convert-date-to-string
                     (get-first-day-of-week (convert-string-to-date today)))
       :end-date   (convert-date-to-string
                    (get-last-day-of-week (get-first-day-of-week (convert-string-to-date today))))}
      {:start-date nil :end-date nil})))

(determine-calculate-dates "monthly")
(determine-calculate-dates "weekly")

