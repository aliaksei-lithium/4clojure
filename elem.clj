;; 1
(= true true)
;; 2
(= (- 10 (* 2 3)) 4)
;; 3
(= "HELLO WORLD" (.toUpperCase "hello world"))
;; 3
(= (list ':a ':b ':c) '(:a :b :c))

(def v '(1 2 3))

;; conj add item to vector tail
;; conj add item to list head

(conj v 8)

(first v)
(= (list 1 2 3 4) (conj '(2 3 4) 1) )

(def k (vector :a :b :c))
(seq k)

(= [:a :b :c] (list :a :b :c) (vec '(:a :b :c)) (vector :a :b :c))

;;8 set
(= (set '(:a :b :c :d)) (set '(:a :a :b :c :c :c :c :d :d)))
(= (set '(:a :b :c :d)) (clojure.set/union #{:a :b :c} #{:b :c :d}))

;;9 set
(= #{1 2 3 4} (conj #{1 4 3} 1 2 ))

;;10 maps
(= 20 ((hash-map :a 10, :b 20, :c 30) :b))
(:b {:b 10, :a "a"})