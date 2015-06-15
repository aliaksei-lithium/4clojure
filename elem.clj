(= true true)

(= (- 10 (* 2 3)) 4)

(= "HELLO WORLD" (.toUpperCase "hello world"))

(= (list ':a ':b ':c) '(:a :b :c))

(def v '(1 2 3))

(conj v 8)

(first v)
(= (list 1 2 3 4) (conj '(2 3 4) 1) )

(def k (vector :a :b :c))
(seq k)

(= [:a :b :c] (list :a :b :c) (vec '(:a :b :c)) (vector :a :b :c))