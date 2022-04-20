package com.zasa.recycler

/**
 **@Project -> Recycler
 **@Author -> Sangeeth on 4/21/2022
 */
 class DataSource {
     fun loadStrings() : List<Affermations>{
         return listOf(
             Affermations(R.string.text01),
             Affermations(R.string.text02),
             Affermations(R.string.text03),
             Affermations(R.string.text04),
             Affermations(R.string.text05),
             Affermations(R.string.text06),
             Affermations(R.string.text07),
             Affermations(R.string.text08),
             Affermations(R.string.text09)

         )
     }
 }