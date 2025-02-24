(ns hobbit-test
  (:require [clojure.test :refer :all]
            [hobbit :refer :all]))


(deftest match-part-test
  (testing "Hobbit Part Match"
    (is (= {:name "head" :size 3} (match-part {:name "head" :size 3})))
    (is (= {:name "right-foot" :size 2} (match-part {:name "left-foot" :size 2})))))

(deftest symmetrize-body-test
  (testing "Symmetrize a Hobbit Body"
    (let [[hobbit-left-body hobbit-full-body]
          [[{:name "head" :size 3}
            {:name "left-eye" :size 1}
            {:name "left-ear" :size 1}
            {:name "mouth" :size 1}]

           [{:name "head" :size 3}
            {:name "left-eye" :size 1}
            {:name "right-eye" :size 1}
            {:name "left-ear" :size 1}
            {:name "right-ear" :size 1}
            {:name "mouth" :size 1}]]]
      (is (= hobbit-full-body (better-symmetrize-body hobbit-left-body)))
      (is (= hobbit-full-body (symmetrize-body hobbit-left-body))))))