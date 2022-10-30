Feature: Login Test

  Scenario: Go to amazon website and test login page

    #Baslangic durumu belli oluyor, herhangi bir websitesine gidicez gidis anı gidis kodları genelde given icinde yer alır.
    Given Go to Amazon website
    #Diger taglar arasında yapılan işlemler.
    And entry name
    And entry password
    # Bir olayi bir aksiyonu tanimlamak icin kullanilir when.
      # When kullaniminda herhangi bir seyi test edicez verify ediceğimiz zaman. **(Test etmek istedigimiz adım whebden sonra geliyor.)**
    When while clicked submit button
    # Then artık beklenen bir  sonucu  ortaya cikarmamizi sagliyor.
    #Biz mesala succes icerigini demişiz asıl testleri yaptigimiz kisim thendir.
    Then verify to succes message

