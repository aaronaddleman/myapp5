(ns myapp5.prod
  (:require [myapp5.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
