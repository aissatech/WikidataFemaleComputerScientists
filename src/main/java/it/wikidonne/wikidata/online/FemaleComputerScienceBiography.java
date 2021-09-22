package it.wikidonne.wikidata.online;

import java.io.IOException;

import org.wikidata.wdtk.datamodel.interfaces.EntityDocument;
import org.wikidata.wdtk.datamodel.interfaces.ItemDocument;
import org.wikidata.wdtk.wikibaseapi.WikibaseDataFetcher;
import org.wikidata.wdtk.wikibaseapi.apierrors.MediaWikiApiErrorException;

//Run as Application
public class FemaleComputerScienceBiography {
	public static void main(String[] args) {
		WikibaseDataFetcher fetcher = WikibaseDataFetcher.getWikidataDataFetcher();
		EntityDocument nominativo = null;		
		EntityDocument universita = null;

		
		//retrieve an entity
		try {
			nominativo = fetcher.getEntityDocument("Q57760894");
			System.out.println("L'ultima versisone dell'entity Q57760894 è "
					+ nominativo.getRevisionId());
			if (nominativo instanceof ItemDocument) {
				System.out.println("La biografia dell'entity Q57760894 è "
						+ ((ItemDocument) nominativo).getLabels().get("it").getText());
				System.out.println("================================================");
			}

			universita = fetcher.getEntityDocument("Q13140900");
			if (universita instanceof ItemDocument) {
	
				System.out.println("La label italiana dell'entity Q13140900 è "
					+ ((ItemDocument) universita).getLabels().get("it").getText()
					+ "\nla pagina Wikipedia in inglese ha il titolo "
					+ ((ItemDocument) universita).getSiteLinks().get("enwiki")
					+ "\nla pagina Wikipedia in francese ha il titolo "
					+ ((ItemDocument) universita).getSiteLinks().get("frwiki"));
			}

		} catch (MediaWikiApiErrorException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
