
DATA = ../goci-diagram/goci-pussycat-metrics/src/main/appresources/gwas-diagram-data-2012-06.owl

all: dataplus.ttl extract-results.ttl

data-hacked.owl: $(DATA)
	grep -v '<Import>' $< > $@

efo.owl:
	wget http://www.ebi.ac.uk/efo/efo.owl -O $@

dataplus.ttl: data-hacked.owl efo.owl
	owltools $< efo.owl --merge-support-ontologies -o -f ttl $@

%-results.ttl: %.rq dataplus.ttl
	arq --query $< --data dataplus.ttl > $@.tmp && mv $@.tmp $@

%-dump.tsv: %-select.rq dataplus.ttl
	arq --results TSV --query $< --data dataplus.ttl > $@.tmp && mv $@.tmp $@

