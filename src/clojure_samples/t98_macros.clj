(ns clojure-samples.t98-macros)

(defmacro my-first-macro [string]
  (apply str (reverse string) ))

;; Inspect the result of a macro using macroexpand or macroexpand-1.
;;
;; Note that the call must be quoted.
(macroexpand '(my-first-macro "where cares"))

;; You can eval the result of macroexpand directly:
(eval (macroexpand '(my-first-macro)))

;; But you should use this more succinct, function-like syntax:
(my-first-macro "who cares")

(when (= 1 1)
  (println "welcome")
  )




