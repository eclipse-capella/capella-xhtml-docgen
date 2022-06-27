package org.polarsys.capella.docgen.test.ju.suites;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.runtime.Path;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.polarsys.capella.docgen.test.ju.cases.AbstractCapellaDocGenTest;
import org.polarsys.capella.docgen.test.ju.reporter.CapellaDocGenHtmlDomainElementReporter;
import org.polarsys.capella.docgen.test.ju.util.CapellaDocGenTestUtil;

@RunWith(Parameterized.class)
public class IFETestSuite extends AbstractCapellaDocGenTest {

	private static String NAME = "IFE";

	@Override
	public String getProjectName() {
		return NAME;
	}

	@Override
	protected String getModelName() {
		return NAME;
	}

	@Parameters(name = "IFE - {0}")
	public static Collection<Object[]> data() {
		Path path = new Path(
				"/model/" + NAME + "/" + NAME + "." + CapellaDocGenHtmlDomainElementReporter.TEST_RESULTS_FILE_EXTENSION);
		List<String> evaluatedModelElementIDs = Arrays.asList(
	            // All packages - Pattern: org.polarsys.capella.docgen.content.packageDocGen
	            "bd182435-e290-42ce-b99f-6dd06e7ae7c7",
	            "8f49452e-61f2-4ba0-b944-352d1f4c4227",
	            "7c142d0f-dd8e-4539-bcb5-3ea9c2fdb59d", // EPBS
	            "48a33f5e-68ef-4754-9d78-45ecce36a6a3",
	            "75447ab8-7d69-4c43-88d0-79ead9c73709",
	            "cab89820-127c-4d24-bfe7-31b2000cc23c", // LA
	            "75619fc8-f3c7-4415-8824-6c9457c7ed7b",
	            "0d9a5fc9-50ad-4ab7-8ce5-db5beebd2e1d",
	            "acc8c52c-8fb3-40ec-a4e0-42ee0d6f9d8b",
	            "cd3c068f-b05f-4749-9a8b-8b6c7b87a9d3",
	            "677bfd1f-909f-433d-a03a-ab2597efefbb",
	            "e12de7af-bf77-4c43-9f7c-03404be33a29", // OA
	            "9e7dc154-82fe-46f0-9448-9d03adc75ee2",
	            "c2be5628-89b1-482e-bf2c-1199c347b03e",
	            "58cb491f-bea3-445b-aaa6-05879e858cb7",
	            "2569c843-e368-451c-b7be-67af191a35a3",
	            "2ced3ae3-205b-4c3b-95dd-ee36361dbe9b",
	            "2ce82a6f-0467-41a5-9c06-28f14ef1dd1b",
	            "e4e400be-b7a3-40a7-b853-019a691560fa",
	            "2fa1be6d-d359-4a83-9c81-1fcc746244a9",
	            "20bc91f3-87c4-457b-8901-dd8b112664df",
	            "9a0668cf-db26-4ee7-9339-c1d8658fa112", // PA
	            "e45249fb-f1c4-44c8-aaa4-482ac55dd8fb",
	            "153bb0ad-182c-4508-a600-2529be317943",
	            "375046b2-f6d4-49b6-ae26-c774e914dc56",
	            "75b9cc1b-9269-40d9-8528-a77115b3a81d",
	            "3e35f75e-142f-4215-b12f-ba44447dfde3",
	            "54c1210d-498a-4504-ac86-16910a5a01d8",
	            "30297fd3-87ad-414f-9eb9-4dea48b8280f",
	            "1d30b780-f222-4794-9f78-5b70ce799bf0", // SA
	            "7fdc15cd-094b-4f7c-bd92-6c8d001fb5e7",
	            "6ace6208-e29a-436c-81df-480776605587",
	            "a97c5584-19b4-4f33-800c-26876ba45ed5",
	            "027d60c2-a487-4344-9a58-f32e7ec3854d",
	            "2eb3cb4c-35bd-40fd-96dc-df4d5f2614c2",
	            "0ded555d-3875-4284-af53-0ecf5f890295",
	            // Functions - Pattern: org.polarsys.capella.docgen.content.AbstractFunctionDocGen
                "cc39bfa2-731b-448d-a8b7-a45d1cf45a97", // OA/OperationalActivity/Multiple IO:AvailableInMode&State:OperationalProcess
                "79dd23d7-af39-4b79-892e-2f8fefbff5ff", // OA/OperationalActivity/OwnsOperationalActivities
                "0f580227-c543-436e-979f-ee70432656e2", // Root LogicalFunction
                "355a6d2b-8c53-46f8-8c0b-38356b4d4271", // LA
                "27d03649-545b-40b0-8407-721165539005", // LA/LogicalFunction/MultipleFunctionalChains
                "8e79917f-4323-4040-b8c5-64c5e42c2a3b", // PA/PhysicalFunction
                "d53e6dd4-3926-4b25-80d1-14553a472f9e", // PA/PhysicalFunction/MultipleFunctionalChains
                // Categories - Pattern: org.polarsys.capella.docgen.content.CategoriesDocGen
                "d3986bd2-066f-4be7-9218-25a47f3d8e40", // SA
                "7e2429d0-82a7-47d0-885f-1502ccff3824", // LA
                "d7ba89f5-23f5-418c-a5c6-c1d601af0876", // PA
                "4d0e2b0c-9f3f-4285-a8fe-6182a2396bfb", // PA PhyLinkCategory
                "a3d1b8bd-d314-4762-a4f1-9e1f769220f1", // PA ComponentExchangeCategory
                // Entity - Pattern: org.polarsys.capella.docgen.content.EntityDocGen
                "dab8526e-cf3a-4c8a-8fa1-7df4aa281bcf", // OA/Entity/MultipleAllocatedActivities:InvolvingCapabilities:IncomingCommunicationMeans
                "e1b91d3f-beb2-40fd-869a-ad45ab8ec951", // OA/Entity/MultipleOwnedEntities:OutgoingCommunicationMeans
                "c4fd192c-6826-4924-bbc3-3a4286b658b4", // OA/Actor/MultipleOwnedEntities:MultipleAllocatedActivities:InvolvingCapabilities
                "daaa759b-bfa4-49bb-89a6-08d99b603af9", // OA/Interaction/InvolvedInOperationalProcess:InvolvedInScenario
                // Capabilities - Pattern: org.polarsys.capella.docgen.content.CapabilityDocGen
                "2569c843-e368-451c-b7be-67af191a35a3", // OA/Capability/RealizeCapabilities:InvolvedEntities
                "187c2207-0995-4241-b8a2-d45550185dff", // PA
                "58c038e4-77d4-4b0e-9a5d-7f4253285be2", // PA
                "e373786f-d962-4a05-9360-902a524b7522", // PA
                // ExchangeItems - Pattern: org.polarsys.capella.docgen.content.ExchangeItemDocGen
                "1fdba7f2-be01-4882-b999-b65528c3ee35", // LA
                "a86aeed3-084c-4618-b23a-bd385f92ecb0", // LA
                "a34141d6-27d6-4e31-9994-828ee1560ded",
                "b1ca4bf5-1b54-4f5c-a385-9514227695d3",
                "32703aff-a875-41e8-a93c-20e8a4b8df4b",
                "03c86c27-a965-4b3a-b641-e1969d4c7261",
                "1cd707ba-fe65-4e3c-9fff-21966d4e5716",
                "d3b096f5-9eb4-4c4a-b0af-946a71992c54",
                "a4ecc90d-72fb-486d-8de2-90d5473df459",
                // FunctionalExchange - Pattern: org.polarsys.capella.docgen.content.FunctionalExchangeDocGen
                "66ca912b-4dc1-4616-9a24-c24fef5ac11e", // LA
                // FunctionalChains - Pattern: org.polarsys.capella.docgen.content.FunctionalChainGenDoc
                "c27f6524-d09e-4962-8f71-c347796bfe6f", // OA/OperationalProcess/MultipleInvolvedElement
                "66ca912b-4dc1-4616-9a24-c24fef5ac11e", // LA
                "8fe69f90-7472-4e05-ab57-1e0fa4e511a4", // LA
                // Interfaces - Pattern: org.polarsys.capella.docgen.content.InterfaceDocGen
                "ccf5b594-6b38-4c7f-8c92-5f592f9181ab",
                "8336c5d9-2c65-48ec-b56b-d9432cd79a63",
                // ComponentContent - Pattern:
                "819adf3f-da1d-4d2b-8faf-3b1d7b99503d",
                // Collections - Pattern: org.polarsys.capella.docgen.content.CollectionDocGen
                "65cc6efd-50a8-44dc-be28-058c74ff0fa3",
                "d03ea02e-75b3-47b2-b4ef-35dd4eac09ea",
                "8e0f15bb-c4da-43cf-82c9-341f4cceed46",
                // Class - Pattern: org.polarsys.capella.docgen.content.ClassDocGen
                "0c17402c-e5e4-44d4-9692-efc4bfb8ab2a",
                "8a3c3a57-1ff3-4d9e-845e-0e142c1ca7dc",
                // DataType - Pattern: org.polarsys.capella.docgen.content.DataTypeDocGen
                "bce10ead-3069-45e2-8ce1-e801648c7e99"
	    );
		Collection<Object[]> testParameters = getTestParameters(path, evaluatedModelElementIDs);
		assertFalse("Test parameters shall not be empty", testParameters.isEmpty());
		return testParameters;
	}
	
	@Parameter
	public static String elementID;

	@Parameter(1)
	public static String expectedContent;

	@Override
	@Test
	public void test() throws Exception {
		String generatedContent = getReporter().getTestResults().get(elementID);
		
		// Generated content must not be null
		assertNotNull("Expected object " + elementID + " cannot be found", generatedContent);
		
		// Format generated content
		generatedContent = CapellaDocGenTestUtil.formatDocGenOutput(generatedContent);
		
		// Generated content must match
		assertEquals("Object " + elementID + " does not match", expectedContent, generatedContent);
	}

	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
	}
}
