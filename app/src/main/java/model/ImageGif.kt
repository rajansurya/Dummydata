package model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
@JsonIgnoreProperties(ignoreUnknown = true)
class ImageGif (){
 var images:Image= Image()

 }
@JsonIgnoreProperties(ignoreUnknown = true)
class origin{
 var url:String=""

}
@JsonIgnoreProperties(ignoreUnknown = true)
 class Alldata(){
  var data:ArrayList<ImageGif> = ArrayList<ImageGif>()
 }