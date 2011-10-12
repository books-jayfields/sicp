(ns sicp.test.exercises-1-2
  (:use expectations))

(expect (/ -37 150)
        (/
         (+ 5 4
            (- 2
               (- 3
                  (+ 6
                     (/ 4 5)))))
         (* 3 (- 6 2) (- 2 7))))
