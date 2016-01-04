(ns reagent-music.prod
  (:require [reagent-music.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
