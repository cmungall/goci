
DATA = ../goci-diagram/goci-pussycat-metrics/src/main/appresources/gwas-diagram-data-2012-06.owl

all: dataplus.ttl

data-hacked.owl: $(DATA)
	grep -v '<Import>' $< > $@

efo.owl:
	wget http://www.ebi.ac.uk/efo/efo.owl -O $@

dataplus.ttl: data-hacked.owl efo.owl
	owltools $< efo.owl --merge-support-ontologies -o -f ttl $@


