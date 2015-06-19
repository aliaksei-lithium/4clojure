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

;;11 conj maps
(= {:a 1, :b 2, :c 3} (conj {:a 1} [:b 2] [:c 3]))

;;12 seqs
(= 3 (first '(3 2 1)))

;;13 rest return all except first
(= [10, 20, 30, 50] (rest [0, 10, 20, 30, 50]))


;;14 func

(= 8 ((fn add-five [x] (+ x 5)) 3))

(= 8 ((fn [x] (+ x 5)) 3))
(= 8 (#(+ % 5) 3))
(= 8 ((partial + 5) 3))

;; func2
(= (* 2 11) 22)

;; hello
(= (#(str "Hello, " % "!") "Lithium") "Hello, Lithium!")

;; seq map
(= '(6 7 8) (map #(+ % 5) '(1 2 3)))

;; seq filter
(= '(6 7) (filter #(> % 5) '(3 4 5 6 7)))


;; get last

(= ((fn [ar] (get ar (- (count ar) 1))) [1 2 3 4 5]) 5)
(= (#(nth % (- (count %) 1)) [1 2 3 4 5]) 5)
(= (#(nth % (- (count %) 1)) '(5 4 3)) 3)
(= (#(nth % (- (count %) 1)) ["b" "c" "d"]) "d")

;; return the second from last 
(comp second reverse)

;;  returns the Nth element from a sequence.
(= (#(first (drop %2 %1)) '(4 5 6 7) 2) 6)

;;returns the total number of elements in a sequence.
#(reduce (fn [a b] inc b) 0 %1)
