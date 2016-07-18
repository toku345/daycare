(ns daycare-front.init
    (:require [daycare-front.core :as core]
              [daycare-front.conf :as conf]))

(enable-console-print!)

(defn start-descjop! []
  (core/init! conf/setting))

(start-descjop!)
