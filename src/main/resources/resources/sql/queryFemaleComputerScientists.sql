SELECT ?item ?itemLabel ?pic ?p27Label ?p19Label ?p20Label ?linkcount WHERE {
  ?item wdt:P21 wd:Q6581072 .                                                         #woman
  ?item wdt:P31 wd:Q5 .                                                               #human being
  ?item wdt:P18 ?pic .
  ?item wdt:P106 ?occ .
  VALUES ?occ {
    wd:Q82594                                                                         #computer science
    wd:Q5482740                                                                       #programming 
    wd:Q327353                                                                        #system administrator
    wd:Q1078262                                                                       #DBA
    wd:Q627325                                                                        #graphic design
    wd:Q1709010                                                                       #software enginnering
  }
  FILTER NOT EXISTS {                                                                 #missing in itwiki
    ?wen schema:about ?item .
    ?wen schema:isPartOf <https://it.wikipedia.org/> .
  }
  ?item wikibase:sitelinks ?linkcount .                                               #number of the linguistic versions
  FILTER (?linkcount > 3 ) .
  OPTIONAL {?item wdt:P27 ?p27}
  OPTIONAL {?item wdt:P19 ?p19}
  OPTIONAL {?item wdt:P20 ?p20}
  SERVICE wikibase:label { bd:serviceParam wikibase:language "[AUTO_LANGUAGE],it". }  #label in italian
}
ORDER BY DESC(?linkcount) 
LIMIT 100
