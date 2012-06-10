(ns neko.ui.-common
  "Contains the initialization and configuration of the most common
  Android UI elements."
  (:use neko.ui.mapping)
  (:import [android.widget LinearLayout Button]
           [android.view ViewGroup$LayoutParams]))

(defelement :button android.widget.Button
  :parents [:layout-params :id])

(defelement :linear-layout android.widget.LinearLayout
  :parents [:layout-params :id])

(defelement :layout-params ViewGroup$LayoutParams
  :values {:fill ViewGroup$LayoutParams/FILL_PARENT
           :wrap ViewGroup$LayoutParams/WRAP_CONTENT})